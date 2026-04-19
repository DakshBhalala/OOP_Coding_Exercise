import pypdf
reader = pypdf.PdfReader('Practical_List.pdf')
with open('practical_list.txt', 'w', encoding='utf-8') as f:
    for page in reader.pages:
        f.write(page.extract_text() + '\n')
