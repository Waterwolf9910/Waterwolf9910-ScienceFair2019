#!/bin/bash

echo Made by Waterwolf9910 and Andon1379
echo 
echo 
echo 
echo Installing
cd ~
sleep 5s
mkdir Caeser_Cipher_encrypt-decrypt
cd Caeser_Cipher_encrypt-decrypt/
git clone -b master https://github.com/Waterwolf9910/Waterwolf9910-ScienceFair2019/
cd Waterwolf9910-ScienceFair2019
javac CaesarCipher.java
cd ..
cd ..
mv installer.sh Caesar_Cipher_encrypt-decrypt/Waterwolf9910-ScienceFair2019/
exit 0
