# oct 1
Today’s lecture covered how AI like ChatGPT works—it can answer questions but isn’t always perfect. Docker must be running before using Ollama. We configure models with a model file, which tells the AI how to behave.

A model file includes the base model, parameters for behavior, system instructions for tone, and a template for output format. Commands used were copying the model file to the container, creating the model, and running it. We tested the model by generating email subject lines and adjusted prompts or templates if needed. Bigger models follow instructions better.

For the frontend, we used a Svelte app and Node.js to run it. The website connects to Ollama to show AI results.

Key points: Docker runs AI in a container, Ollama runs models locally, and the model file customizes AI behavio
