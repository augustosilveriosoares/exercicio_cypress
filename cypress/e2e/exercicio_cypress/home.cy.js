describe('Teste de funcionalidades da agenda de contatos', () => {
beforeEach(() => {
    cy.visit('https://agenda-contatos-react.vercel.app/')
})

it('Deve incluir um novo contato', () => {
    
    cy.get('[placeholder="Nome"]').type('Teste Contato')
    cy.get('[placeholder="E-mail"]').type('teste@contato.com')
    cy.get('[placeholder="Telefone"]').type('(99) 9999-9999')

    
    cy.get('[type="submit"]').click()

    cy.contains('Teste Contato').should('exist')
    cy.contains('(99) 9999-9999').should('exist')
    cy.contains('teste@contato.com').should('exist')
})

it('Deve alterar um contato existente', () => {
    cy.contains('Teste Contato').parent().parent().parent().find('button[class="edit"]').click();


    cy.get('[placeholder="Nome"]').clear().type('Nome Modificado');
    cy.get('[placeholder="E-mail"]').clear().type('modificado@contato.com')
    cy.get('[placeholder="Telefone"]').clear().type('(88) 8888-8888')

    
    cy.get('[type="submit"]').click()

    cy.contains('Nome Modificado').should('exist')
    cy.contains('(88) 8888-8888').should('exist')
    cy.contains('modificado@contato.com').should('exist')
})

it('Deve remover um contato existente', () => {
    cy.contains('Nome Modificado').parent().parent().parent().find('button[class="delete"]').click();

    cy.contains('Nome Modificado').should('not.exist')
})
})
