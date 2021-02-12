import os
f=open('newfile.txt','w')
with open('text.txt','r') as file:
#lines=file.readlines()
    for line in file: 
        filename = os.path.basename(line)
        f.write(filename)
        print(filename)
