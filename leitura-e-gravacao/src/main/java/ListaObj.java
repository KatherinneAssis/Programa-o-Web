public class ListaObj<T> {

    private T[] vetor;
    private int nroElem;

    public ListaObj(int tamanho) {
        vetor = (T[]) new Object[tamanho];
    }

    public void adiciona(T elemento) {
        if(nroElem >= vetor.length){
            throw new IllegalStateException();
        }
        vetor[nroElem] = elemento;
        nroElem++;
    }

    public int busca(T elementoBuscado) {
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == elementoBuscado){
                return i;
            }
        }
        return -1;
    }

    private void removeElement(int index){
        for (int i = index + 1; i < vetor.length; i++) {
            vetor[index++] = vetor[i];
        }
        vetor[vetor.length - 1] = null;
        nroElem--;
    }

    public boolean removePeloIndice(int indice) {
        if(indice > nroElem || indice < 0){
            return false;
        }
        removeElement(indice);
        return true;
    }


    public boolean removeElemento(T elementoARemover){
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == elementoARemover){
                removeElement(i);
                return true;
            }
        }
        return false;
    }

    public int getTamanho() {
        return nroElem;
    }

    public T getElemento(int indice) {
        if(indice > nroElem || indice < 0){
            return null;
        }
        return vetor[indice];
    }

    public void limpa() {
        vetor = (T[]) new Object[vetor.length];
    }

    public void exibe() {
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if(!(i == vetor.length)){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public T[] getVetor() {
        return vetor;
    }
}