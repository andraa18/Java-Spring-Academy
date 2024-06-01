// ASYNC AWAIT

/**
 * Riscrivere l'esercizio PROMISE, sfruttando però async await.
 */

async function ottieneDatiDaServer() {
    try {
        let promise = new Promise(function (resolve, reject) {
            setTimeout(() => {
                let risultato = "Dati ok";
                resolve(risultato);
            }, 3000);
        });

        let risultato = await promise;
        console.log(risultato); // Dati ok
    } catch (errore) {
        console.error(errore);
    }
}

ottieneDatiDaServer();