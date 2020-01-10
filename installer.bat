@echo off

echo Made by Waterwolf9910 and Andon1379
echo .
echo .
echo .
echo enjoy!


cd %homepath%
mkdir Ceasar_Cipher_encrypt-decrypt
cd Ceasar_Cipher_encrypt-decrypt\
git clone -b master https://github.com/Waterwolf9910/Waterwolf9910-ScienceFair2019/
cd Waterwolf9910-ScienceFair2019
rd /s /q .github
rd /s /q .git
erase .gitignore
erase installer.bat
erase uninsall.sh
move * ..\
cd ..
javac CeasarCipher.java
pause
exit 0

