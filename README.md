
gradle clean build
docker build --platform linux/amd64 -t quotes . 
docker build -t quotes . 

docker images
docker tag 66b32bfa73cb zhkvaleksey/quotes:latest
docker push zhkvaleksey/quotes
