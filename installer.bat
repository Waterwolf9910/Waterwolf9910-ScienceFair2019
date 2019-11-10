@echo off

echo Made by Waterwolf9910 and Andon1379
echo .
echo .
echo .
echo enjoy!

setlocal
set /p run-install="run or install: "
if %run-install% == install goto installer
if %run-install% == run goto runner
:installer
@echo on
mkdir Ceasar_Cipher_encrypt-decrypt
cd Ceasar_Cipher_encrypt-decrypt\
git clone -b master https://github.com/Waterwolf9910/Waterwolf9910-ScienceFair2019/
cd Ceaser_Cipher_encrypt-decrypt\Waterwolf9910-ScienceFair2019
javac CeasarCipher.java
endlocal
set run-install=
pause
exit 0

:runner
java CeasarCipher
pause
exit 0
