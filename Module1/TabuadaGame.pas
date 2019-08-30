// -----------------------------------------------------------------
// Programa que mostra a tabuada de um número. :~
//
// Autor   : Thiag Jacinto - Beta Tester
// Contato : ---------------
// ----------------------------------------------------------------
Program Aula22082019 ;
Var i: integer ;
    N: integer;
    valor: integer;
    qteErros: integer;
    aleatorio: integer;
    
 Begin
    // Solicita o número
    writeln('Bem-vindo ao programa da Tabuada.');
    write('Informe o número desejado: ');
    readln(N);
    
    // Escolhe um numero aleatorio entre 0 e 9:
    aleatorio:= random(9);
    
    // Verifica se o usuario sabe um dos resultados:
    write('Teste! Voce sabe o resultado da operação ', N, ' X ', aleatorio, '? Digite o resultado: ');
    readln(valor);
    
    // Verifica se o usuario acertou o teste:
    while valor <> N*aleatorio do
    	begin
    		qteErros:= qteErros + 1;
    		write('Ah... você errou: ', qteErros, ' vez(es). Tente outra vez: ');
    		readln(valor);
    	end;
    
    // Se o usuario acertou o teste, mostrar a tabuada.
		if valor = N*aleatorio then
			begin 
    	writeln('Parabens, você acertou após ', qteErros, ' tentativas. Agora veja a tabuada completa: ' );
    	// Mostra a tabuada do número
    	for i:= 1 to 10 do
      	begin
        	writeln(N, ' X ', i:2, ' = ', N*i:2);
      	end;
      end
 End.
