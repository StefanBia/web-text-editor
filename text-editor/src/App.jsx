import { useState } from 'react'
import './App.css'
import Editor from '@monaco-editor/react'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
        <div className="App">
            <Editor
            height="100vh"
            width="100%"
            theme="vs-dark"
            defaultLanguage="javascript"
            defaultValue="muie bia"
                />
        </div>
    </>
  )
}

export default App
