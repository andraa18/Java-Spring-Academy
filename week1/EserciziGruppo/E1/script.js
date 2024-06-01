let persona1 = {
    username: "flavio",
    password: 123,
    iban: "abc",
    saldo: 2000,
};

let persona2 = {
    username: "giuly",
    password: 124,
    iban: "abd",
    saldo: 3000,
};

let persona3 = {
    username: "andra",
    password: 125,
    iban: "abe",
    saldo: 5000,
};

let persone = [persona1, persona2, persona3];

while (true) {
    let scelta = prompt("Buongiorno!\n1) Accesso\n2) Uscita");
    let i = 0;
    let utente_loggato;
    scelta = Number(scelta);

    if (scelta === 1) {
        let username = prompt("1)Inserire username");

        for (i; i < persone.length; i++) {
            if (persone[i].username === username) break;
        }

        if (i === 3) {
            alert("Username non corretto");
            break;
        }

        let password = prompt("2)Inserire password");
        password = Number(password);

        for (i = 0; i < persone.length; i++) {
            if (persone[i].password === password) {
                utente_loggato = persone[i];
                break;
            }
        }

        if (i === 3) {
            alert("Password non corretta");
            break;
        }

        alert(`Ciao ${username}`);

        scelta = prompt("1) Deposita\n2) Preleva\n3) Bonifico");
        scelta = Number(scelta);

        switch (scelta) {
            case 1:
                let deposito = prompt("Inserire la somma da depositare");
                deposito = Number(deposito);
                utente_loggato.saldo += deposito;
                console.log(utente_loggato);
                break;

            case 2:
                let prelievo = prompt("Inserire la somma da prelevare");
                prelievo = Number(prelievo);

                if (prelievo > utente_loggato.saldo) {
                    alert("Saldo insufficiente");
                    break;
                } else {
                    utente_loggato.saldo -= prelievo;
                    console.log(utente_loggato);
                    break;
                }

            case 3:
                iban = prompt("Inserire l'iban del destinatario");

                for (i = 0; i < persone.length; i++) {
                    if (iban === persone[i].iban) {
                        somma = prompt("Inserire la somma da inviare");
                        somma = Number(somma);
                        if (somma > utente_loggato.saldo) {
                            alert("Saldo insufficiente");
                            break;
                        } else {
                            utente_loggato.saldo -= somma;
                            persone[i].saldo += somma;
                            alert("Bonifico inviato con successo!");
                            console.log(persona1, persona2, persona3);
                            break;
                        }
                    }
                }

                if (i === 3) {
                    alert("Iban non trovato");
                    break;
                }

                break;

            default:
                alert("Inserisci un valore valido la prossima volta!");
                break;
        }
    } else if (scelta === 2) {
        alert("Buona giornata!");
        break;
    } else {
        alert("Input non valido");
    }
}