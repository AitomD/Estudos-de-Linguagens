function Card({ nome, preco }) {
  return (
    <div style={{
      border: '1px solid #ccc',
      padding: '10px',
      marginBottom: '10px',
      width: '200px'
    }}>
      <h3>{nome}</h3>
      <p>R$ {preco}</p>
      <button>Adicionar</button>
    </div>
  )
}

export default Card
