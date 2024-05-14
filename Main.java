public class Main
{
	public static void main(String[] args) {
		Cliente thor = new Cliente();
		thor.setNome("THOR");
		thor.setCpf("000.000.000-00");
		thor.setIdade(29);
		thor.setEmail("thortrovao@gmail.com");
		thor.setSenha("@trovao123");
		System.out.println(thor.getDadosCliente());
		
		Funcionario zeus = new Funcionario();
		zeus.setNome("ZEUS");
		zeus.setCpf("111.111.111-11");
		zeus.setIdade(18);
		zeus.setCargo("PADEIRO");
		zeus.setSalario(1355.67);
		System.out.println(zeus.getDadosFuncionario());
	}
}