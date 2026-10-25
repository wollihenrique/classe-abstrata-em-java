public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Gerente("Marcos", 8000);
        Funcionario funcionario2 = new Desenvolvedor("Ana", 5000);

        System.out.println(funcionario1.mostrarDados() + ", Bônus: " + funcionario1.calcularBonus());
        System.out.println(funcionario2.mostrarDados() + ", Bônus: " + funcionario2.calcularBonus());
    }
}
