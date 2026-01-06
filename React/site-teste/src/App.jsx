import Header from './components/Header'
import Card from './components/Card'

function App() {
  return (
    <>
      <Header />

      <main style={{ padding: '20px' }}>
        <h2>Produtos</h2>

        <Card nome="Hambúrguer" preco={25} />
        <Card nome="Açaí" preco={18} />
        <Card nome="Milkshake" preco={15} />
      </main>
    </>
  )
}

export default App
