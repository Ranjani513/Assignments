
import './App.css';
import Stateex from './Stateex';
import Increment from './Increment';
import FunctionalComponent from './FunctionalComponent';
import Parent from './ComponentCommunication/Parent';

import TodoListApp from './Todo/TodoListApp';
function App() {
  return (
    <div className="App">
      <div Style="border:3px solid black;margin-bottom:100px;background-color:white;color:black">
    <h2>Nested component</h2>
    < Stateex></Stateex>
     <h2>State Example</h2>
    <Increment></Increment>
    <h2>Function Component</h2>
    <FunctionalComponent></FunctionalComponent>
    <h2>Component Communication(Parent To Child)</h2>
    <Parent></Parent>
    </div>
     <TodoListApp></TodoListApp>
    </div>
    
  );
}
export default App;
