// ESERCIZIO SU CALLBACK

/**
 *
 * Scrivere una funzione che accetti due parametri
 * - un nome
 * - una callback
 *
 * La funzione deve concatenare il nome che gli passiamo
 * con una stringa di saluto e passare il risultato
 * alla callback
 */

function miaCallback() {
  console.log("Sono la callback");
}

function saluta(x) {
  x();
  console.log("Ciao Simone!");
}

saluta(miaCallback);