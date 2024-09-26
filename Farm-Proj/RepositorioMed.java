import java.util.ArrayList;
import java.util.List;

class RepositorioMed {
    private List<Medicamento> medicamentos = new ArrayList<>();


    public void adicionarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }


    public List<Medicamento> listarMedicamentos() {
        return medicamentos;
    }


    public void atualizarMedicamento(String nome, double preco, int quantidade) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getNome().equals(nome)) {
                medicamento.setPreco(preco);
                medicamento.setQuantidade(quantidade);
            }
        }
    }


    public void removerMedicamento(String nome) {
        medicamentos.removeIf(medicamento -> medicamento.getNome().equals(nome));
    }
}