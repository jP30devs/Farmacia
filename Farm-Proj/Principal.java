public class Principal {
    public static void main(String[] args) {
        RepositorioMed repo = new RepositorioMed();

        // Cadastrar um medicamento
        Medicamento medicamento1 = new Medicamento("Paracetamol", 5.50, 200);
        repo.adicionarMedicamento(medicamento1);

        

        // Listar medicamentos
        System.out.println("Lista de Medicamentos: " + repo.listarMedicamentos());

        // Atualizar um medicamento
        repo.atualizarMedicamento("Paracetamol", 6.00, 150);
        System.out.println("Após atualização: " + repo.listarMedicamentos());

        // Remover um medicamento
        repo.removerMedicamento("Paracetamol");
        System.out.println("Após remoção: " + repo.listarMedicamentos());
    }
}