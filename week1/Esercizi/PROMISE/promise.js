// ESERCIZIO SU PROMISE

/**
 *
 * Scrivete una funzione "ottieniIDati" che restiutuirà
 * una promise.
 *
 * La promise (per motivi didattici) si deve "risolvere"
 * dopo 3.5s fornendo una stringa "Ok, dati ricevuti correttamente".
 *
 * Catturate il risultato e stampatelo in console.
 */

let promise = new Promise(function (resolve, reject) {
  setTimeout(() => {
    let risultato = "Lista degli utenti della dashboard";
    resolve(risultato);
  }, 1500);
});

promise
  .then(function (risultato) {
    console.log("Fulfilled", risultato);
  })
  .catch(function (errore) {
    console.log(errore);
  });
