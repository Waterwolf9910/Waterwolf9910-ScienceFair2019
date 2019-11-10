#!/bin/bash

echo Made by Waterwolf9910 and Andon1379
echo 
echo 
echo 
echo enjoy!

read -p 'run, install or uninstall: ' runinstall

if set $runinstall == install
then
    mkdir Ceaser_Cipher_encrypt-decrypt
    cd Ceaser_Cipher_encrypt-decrypt/
    git clone -b master https://github.com/Waterwolf9910/Waterwolf9910-ScienceFair2019/
    cd Ceaser_Cipher_encrypt-decrypt/Waterwolf9910-ScienceFair2019
    javac CeasarCipher.java
    exit 0
elif set $runinstall == run
then
    java CeasarCipher
    exit 0
elif set $runinstall == uninstall
then
    rm Ceaser_Cipher_encrypt-decrypt/Waterwolf9910-ScienceFair2019/CeasarCipher.class
    rm Ceaser_Cipher_encrypt-decrypt/Waterwolf9910-ScienceFair2019/CeasarCipher.java
    rm Ceaser_Cipher_encrypt-decrypt/Waterwolf9910-ScienceFair2019/README.md
    rm Ceaser_Cipher_encrypt-decrypt/Waterwolf9910-ScienceFair2019/installer.bat
    rm Ceaser_Cipher_encrypt-decrypt/Waterwolf9910-ScienceFair2019/installer.sh
    rmdir Ceaser_Cipher_encrypt-decrypt/Waterwolf9910-ScienceFair2019
    rmdir Ceaser_Cipher_encrypt-decrypt
    rm run.sh
    exit 0
else
    exit 1
fi
