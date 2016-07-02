/**
 * Leitura e Localização de Cep
 * @author Mauricio Figueiredo Neto
 */
    public void buscaCep() {
        //Faz a busca para o cep 58043-280
        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep1.getText());
        //A ferramenta acima ignora qualquer tipo de caracter que não seja numero.

        //caso a busca ocorra bem, os resultados sao:
        if (webServiceCep.wasSuccessful()) {
            r1.setText(webServiceCep.getLogradouroFull());
            c1.setText(webServiceCep.getCidade());
            b1.setText(webServiceCep.getBairro());
            e1.setSelectedItem(webServiceCep.getUf());
            System.out.println("Cep: " + webServiceCep.getCep());
            System.out.println("Logradouro: " + webServiceCep.getLogradouroFull());
            System.out.println("Bairro: " + webServiceCep.getBairro());
            System.out.println("Cidade: "
                    + webServiceCep.getCidade() + "/" + webServiceCep.getUf());

            //Caso haja problemas a mensagem sera essa abaixo:
        } else {
            JOptionPane.showMessageDialog(null, "CEP Inválido: " + webServiceCep.getResultText());
        }
    }

