
#Tristan Dinh
.intel_syntax noprefix
.data 

Welcome: 
	.ascii "Welcome to Tek Battles!\n\0"

Written:
	.ascii "Written by Tristan Dinh\n\0"

Players: 
	.ascii "How many players are in this game? \0"

PlayerInfo:
	.ascii "\nPlayer: \0"

PlayerHealth:
	.quad 100
	.quad 100
	.quad 100
	.quad 100
	.quad 100
	.quad 100
	.quad 100
	.quad 100
	.quad 100
	.quad 100

Player:
	.quad 0
	.quad 1
	.quad 2
	.quad 3
	.quad 4
	.quad 5
	.quad 6
	.quad 7
	.quad 8
	.quad 9

Health:
	.ascii "\nHealth: \0"

Target: 
	.ascii "\nWho are you going to attack with your stick? \0"

Damage:
	.ascii "Your spell did \0"

Dmg:
	.ascii " damage \n\0"

Die:

	.ascii "Your Health is at 0, You have been slayed\n\0"

Winner:
	.ascii  "\n This player has won!\n\0"

Art:
	.ascii "    /\\_____/\\   \n"
        .ascii "   /  o   o  \\  \n"
        .ascii "  ( ==  ^  == ) \n"
        .ascii "   )         (\n"
        .ascii "  (           )\n"
        .ascii " ( (  )   (  ) )\n"
        .ascii "(__(__)___(__)__)\n\0"


Art1:
	.ascii "	\\_________________/ \n"
	.ascii "        |       | |       |  \n"
	.ascii "        |       | |       |  \n"
	.ascii "        |       | |       |  \n"
	.ascii "        |_______| |_______|  \n"
	.ascii "	|_______   _______|  \n"
	.ascii "	|       | |       |  \n"
	.ascii "	|       | |       |  \n"
	.ascii "	 \\      | |      /  \n"
 	.ascii "	  \\     | |     /   \n"
	.ascii "	   \\    | |    /    \n"
	.ascii "	    \\   | |   /     \n"
	.ascii "	     \\  | |  /      \n"
	.ascii "	      \\ | | /       \n"
	.ascii "	       \\| |/        \n"
	.ascii "		\\_/         \n\0"

Art2:
		.ascii "	                                              && \n"
		.ascii "                                                    && \n"
		.ascii " ______________________________________,___________&&&&              & \n"
		.ascii "/__________________________________________________&@@@@@@@@@@@@@@@@&&} \n"
		.ascii "\\______________________________________ ___________&@@@@@@@@@@@@@@@@&&} \n"
		.ascii "                                       `           &&&&              & \n"
		.ascii "				                    && \n"
		.ascii "	                                              && \n\0"




.text 
.global _start
_start:
	lea rdx, Art
	call PrintZString
	mov rdx, 5
	call SetForeColor
	lea rdx, Welcome                                 #prints user the welcome screen
	call PrintZString
	lea rdx, Written
	call PrintZString
	lea rdx, Art2
	call PrintZString
Ask: 
	lea rdx, Players
	call PrintZString                              #prints the user how many players are playing then initializes it at 0
	call ScanInt
	mov r10, rdx        
	sub r10, 1
	mov rsi, 0
	mov rax, 0

Game:                         
	mov rbx, [PlayerHealth + rsi * 8]
	lea rdx, PlayerInfo
	call PrintZString                            #moves 0 into Player and PlayerHealth to start the players at 0
	mov rdx, [Player + rax * 8]
	call PrintInt		
	jmp New

New:
	lea rdx, Health                     #prints the health and compares if expected amount of players is equal to 0 to jump to the end screen
	call PrintZString
	mov rdx, rbx
	cmp r10, 0
        je End
	jmp New1

New1:
	cmp rdx, 1                          #compares the health of the player and jumps to dead method if it is less than 1
        jl Dead
	call PrintInt
	jmp First

First:
	mov rdx, 1
	call SetForeColor
	lea rdx, Target
	call PrintZString
	call ScanInt
	mov rcx, rdx
	lea rdx, Damage
	call PrintZString
	mov rdx, 100 
	call Random                         #random damage 
	mov r9, rdx
	call PrintInt
	lea rdx, Dmg
	call PrintZString
	sub [PlayerHealth + rcx * 8], r9    #subtracts the target players health to the random damage
	mov rdx, [PlayerHealth + rcx * 8]  #moves the health back to rdx to save it
	cmp rdx, 1
	jl Dead1
	jmp Second

Second:
	cmp r10, 0                        #checks if after running through the player if the expected amount of players is at 0 to jump to the winner
	je End
	jmp Equal

Dead:	
	sub r10, 1                         #checks if the current players turn is dead
	lea rdx, Die
	call PrintZString
	jmp Equal

Dead1:
	lea rdx, PlayerInfo                  #checks if the player the user selected to be attacked is dead and jumps to equal
	call PrintZString
	mov rdx, rcx
	call PrintInt
	lea rdx, Health
	call PrintZString
	lea rdx, Die
	call PrintZString		
	jmp Equal
	
Equal:
	cmp rax, r10                 #compares whether the place of the index is less than the amount of players the user input
	jl Add		            #If players are less than expected players than jumps to fact
	jmp Fact

Fact:
	mov rsi, 0                   #resets the index back to 0, goes back to player 0
	mov rax, 0
	jmp Game

Add:
	add rax, 1                 #adds 1 to the index to move to the next player
	add rsi, 1
	jmp Game	

	
End: 
	cmp rdx, 1                    #compares whether or not the health is greater than 1"
	jg End1                     #if greater than 1 than it jumps to winner"
	jmp Add

End1:   
	mov rdx, 6
	call SetForeColor
	lea rdx, Winner              #prints out the winner and exits out the program
	call PrintZString
	lea rdx, Art1
	call PrintZString
	call Exit

