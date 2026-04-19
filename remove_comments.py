import os

def remove_java_comments(source):
    result = []
    state = 'NORMAL'
    i = 0
    while i < len(source):
        char = source[i]
        
        if state == 'NORMAL':
            if char == '/' and i + 1 < len(source):
                next_char = source[i+1]
                if next_char == '/':
                    state = 'LINE_COMMENT'
                    i += 1
                elif next_char == '*':
                    state = 'BLOCK_COMMENT'
                    i += 1
                else:
                    result.append(char)
            elif char == '"':
                state = 'STRING'
                result.append(char)
            elif char == "'":
                state = 'CHAR'
                result.append(char)
            else:
                result.append(char)
                
        elif state == 'STRING':
            result.append(char)
            if char == '\\':
                if i + 1 < len(source):
                    result.append(source[i+1])
                    i += 1
            elif char == '"':
                state = 'NORMAL'
                
        elif state == 'CHAR':
            result.append(char)
            if char == '\\':
                if i + 1 < len(source):
                    result.append(source[i+1])
                    i += 1
            elif char == "'":
                state = 'NORMAL'
                
        elif state == 'LINE_COMMENT':
            if char == '\n':
                state = 'NORMAL'
                result.append(char)
                
        elif state == 'BLOCK_COMMENT':
            if char == '*' and i + 1 < len(source) and source[i+1] == '/':
                state = 'NORMAL'
                i += 1
                
        i += 1

    lines = "".join(result).splitlines()
    clean_lines = [line for line in lines if line.strip() != ""]
    return "\n".join(clean_lines) + "\n"

def process_directory(directory):
    count = 0
    for root, dirs, files in os.walk(directory):
        for f in files:
            if f.endswith('.java'):
                path = os.path.join(root, f)
                with open(path, 'r', encoding='utf-8') as file:
                    content = file.read()
                
                clean_content = remove_java_comments(content)
                
                with open(path, 'w', encoding='utf-8') as file:
                    file.write(clean_content)
                count += 1
    print(f"Removed comments from {count} Java files.")

if __name__ == '__main__':
    process_directory('.')
