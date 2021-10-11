package br.com.zup.util;

public class Validacao {

    public static void validarEmail(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Email inválido! insira o @");
        }
    }
}