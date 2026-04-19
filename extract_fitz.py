import fitz
doc = fitz.open('Practical_List.pdf')
with open('practical_list_fitz.txt', 'w', encoding='utf-8') as f:
    for page in doc:
        f.write(page.get_text() + '\n')
