# oct 29
today’s lecture focused on how to install and use Docker to deploy AI applications. Docker allows software to run the same on any system—Windows, Mac, or Linux. Containers are faster and lighter than virtual machines because they share the same operating system kernel instead of needing a full OS for each app.

We went over core Docker concepts: an image is a snapshot of an app and its dependencies, a container is a running version of that image, a Dockerfile contains the instructions to build an image, and a volume stores data from a container.

Some common Docker commands include docker run hello-world to test the installation, docker ps -a to list containers, docker rm <name> to remove one, docker rmi <image> to remove an image, docker images to view available images, docker --version to check the version, and docker help to see command options.

For setup, Windows users should install Docker Desktop with WSL, and Mac users should choose the correct version for Intel or Apple Silicon. Make sure virtualization is enabled in BIOS—no login or account is needed.

In class, we ran an example command:
docker run -d -p 8080:80 --name nginx nginx
This started an NGINX web server 

The main takeaway is that Docker is a lightweight, consistent tool for running and sharing applications, and it will be used again in future cloud and database courses.
