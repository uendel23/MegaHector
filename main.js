
    // URL da API Backend
    const API_URL = "https://sua-api-backend.com/endpoint"; // Substitua pela URL real da sua API

    // Captura elementos do formulário
    const embalagem = document.getElementById("embalagem");
    const quantidade = document.getElementById("quantidade");
    const resultado = document.getElementById("resultado");
    const enviarBtn = document.getElementById("enviar");

    // Evento de clique no botão "Enviar"
    enviarBtn.addEventListener("click", async function() {
      // Obtém os valores dos campos
      const volume = parseInt(embalagem.value); // Valor da embalagem
      const qtd = parseInt(quantidade.value);  // Quantidade digitada

      // Validação simples
      if (isNaN(volume) || isNaN(qtd) || qtd <= 0) {
        resultado.value = "Valores inválidos!";
        return;
      }

      // Cria o payload para enviar à API
      const data = {
        embalagem: volume,
        quantidade: qtd
      };

      try {
        // Envia os dados para a API usando fetch
        const response = await fetch(API_URL, {
          method: "POST",
          headers: {
            "Content-Type": "application/json"
          },
          body: JSON.stringify(data)
        });

        // Verifica se a resposta foi bem-sucedida
        if (!response.ok) {
          throw new Error("Erro ao enviar os dados para a API.");
        }

        // Lê a resposta da API
        const result = await response.json();

        // Exibe a resposta no campo de resultado
        resultado.value = result.message || "Dados enviados com sucesso!";
      } catch (error) {
        // Exibe o erro no campo de resultado
        resultado.value = "Erro: " + error.message;
      }
    });
 