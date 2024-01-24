gradle clean build
docker build --platform linux/amd64 -t quotes .
docker build -t quotes .

docker images
docker tag d48eec095ca6 zhkvaleksey/quotes:0.0.1
docker push zhkvaleksey/quotes:0.0.1
