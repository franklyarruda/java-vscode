package exemplos.caixaMensagem;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class exemplo03 {
    public static void main(String[] args) {
         // arraylista é uma classe java mais flexivel para manipular uma lista
         ArrayList<String> lista = new ArrayList<String>();
         int selecionado = 0;
         Object[] opcoes = { "Incluir", "Listar", "Apagar","Alterar", "Finalizar" };
        
         do {
            try{
             selecionado = JOptionPane.showOptionDialog(
                     null,
                     "O que você deseja?",
                     "Exemplo",
                     JOptionPane.DEFAULT_OPTION,
                     JOptionPane.WARNING_MESSAGE,
                     null, opcoes, opcoes[0]);
             if (selecionado == 0) { // opcoes[selecionado].equals("Incluir")
             
             String item = JOptionPane.showInputDialog("Digite");
             if(item != null){
             lista.add(item); // guarda na lista o item digitado
             }
            }
             if (selecionado == 1) {
                 String msg = "";
                 for (String item : lista) {
                     msg += item + "\n";
                 }
                 if(msg.equals("")){
                    msg = "Lista vazia";
                 }

                 JOptionPane.showMessageDialog(null, msg);
             }
             if (selecionado == 2 && lista.size() > 0) {
                 Object[] opcaoApagar = new Object[lista.size()];
                 for (int i = 0; i < opcaoApagar.length; i++) {
                     opcaoApagar[i] = lista.get(i);
                 }
                
                 Object itemSelecionado = JOptionPane.showInputDialog(
                         null,
                         "Selecione o item para apagar",
                         "Apagar",
                         JOptionPane.INFORMATION_MESSAGE,
                         null,
                         opcaoApagar,
                         opcaoApagar[0]);
                 // System.out.println(itemSelecionado.toString());
                 for (int i = 0; i < lista.size(); i++) {
                     if (itemSelecionado != "null" && itemSelecionado.toString().equals(lista.get(i))) {
                         lista.remove(i);
                     }
                 }
             }
             if(selecionado == 3 && lista.size() > 0){
                Object[] opcaoAlterar = new Object[lista.size()];
                for (int i = 0; i< opcaoAlterar.length; i++){
                    opcaoAlterar[i] = lista.get(i);
                    
                }
                Object itemSelecionado = JOptionPane.showInputDialog(
                    null,
                    "Selecione o item para alterar",
                    "alterar",
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcaoAlterar,
                    opcaoAlterar[0]);
                    // System.out.println(itemSelecionado.toString());
                    for (int i = 0; i < lista.size(); i++) {
                        if (itemSelecionado != "null" && itemSelecionado.toString().equals(lista.get(i))) {
                    String alt = JOptionPane.showInputDialog("Digite a alteração ", lista.get(i));
                    lista.set(i, alt);
                }

             }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "try c");
        }
         } while (selecionado != 4 && selecionado != -1);
 
    }
}
