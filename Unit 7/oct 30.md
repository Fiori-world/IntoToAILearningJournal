# oct 30
Today we learned how to run AI models locally using Docker. Docker helps keep installations clean and works on any operating system. Ollama is used to run open-source AI models offline. For hardware, using a GPU makes things faster, though a CPU will still work but more slowly, and models use both RAM and VRAM.

Some basic Docker commands include docker --version to check the installation, docker ps -a to list containers, docker run to start one, and docker exec -it <name> bash to open a container. For setting up Ollama, it should be installed through Docker, not directly. To run a model, use ollama pull qwen:3b and then ollama run qwen:3b. Smaller models between 1B and 7B parameters work best.

We also learned about quantization, which reduces model size to make it faster but slightly less accurate. To use a web interface, run docker compose up -d and then open localhost:3000 in your browser to access it.
