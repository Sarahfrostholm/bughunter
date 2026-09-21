/* Skriv en klasse til at håndtere bankkonti */

double balance = 1000;

void main() {
    withdraw();
    deposit();
    IO.println(balance);
}

void withdraw() {
    balance = balance - (double) 1200;
}

void deposit() {
    balance = balance + (double) 100;
}
