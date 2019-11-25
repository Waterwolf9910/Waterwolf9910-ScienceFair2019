#!/bin/bash

echo Made by Waterwolf9910 and Andon1379
echo 
echo 
echo 
echo Installing
function pause() {
     read -p "$*"
}
mv installer.sh ~
cd ~
sudo apt install git openjdk-8-jdk openjdk-8-jre
sleep 5s
mkdir Caesar_Cipher_encrypt-decrypt
cd Caesar_Cipher_encrypt-decrypt/
git clone https://github.com/Waterwolf9910/Waterwolf9910-ScienceFair2019/
cd Waterwolf9910-ScienceFair2019
javac CaesarCipher.java
chmod +x run.sh
cd ..
cd ..
mv installer.sh Caesar_Cipher_encrypt-decrypt/Waterwolf9910-ScienceFair2019/
echo do cd ~/Caesar_Cipher_encrypt-decrypt/Waterwolf9910-ScienceFair && sh run.sh or ./~/Caesar_Cipher_encrypt-decrypt/Waterwolf9910-ScienceFair/run.sh
pause 'Press [enter] to end script'
exit 0
