/*A cidade de Araraquara possui cerca de 250 mil habitantes e uma taxa de crescimento
populacional de 3% ao ano. Já a cidade de São Carlos possui cerca de 265 mil habitantes e uma
taxa de crescimento populacional de 2% ao ano. Baseando-se nessas informações, quantos
anos são necessários para que a população de Araraquara ultrapasse a população de São
Carlos? */

class Populacao {
    public static void main(String[] args) {
        double populacaoAqa = 250000, populacaoSc = 265000;
        double taxaAqa = 0.03, taxaSc = 0.02;
        int tempo = 0;

        while(populacaoAqa <= populacaoSc) {
            populacaoAqa *= (1 + taxaAqa);
            populacaoSc *= (1 + taxaSc);
            tempo += 1;
        }
        
        System.out.printf("São necessários %d anos para que a população de AQA seja maior que a de SC.\n", tempo);

    }
}
