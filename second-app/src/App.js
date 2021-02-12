import logo from './logo.svg';
import './App.css';
//import {Link} from 'react-router';
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import Eventcomponent from './Event/Eventcomponent';
import Logincontrol from './Event/Conditional rendering/Logincontrol';
import Form from './Refs/Form';
import Alert from 'react-bootstrap/Alert';
import Tables from './Tables';
import { Home } from '@material-ui/icons';
import Home1 from './Home1';
function SubmitEvent()
{
  <Alert variant="success">hello</Alert>
  alert("hello");
}


function App() {
 
  const numbers=[2,3,4,5]
  const listItems = numbers.map((number) =>
    <li key={number.toString()}>{number*2}</li>
  );
  
 
  return (
    <div className="App" Style="background-color:lightblue;">
      <h2>Handling Event & keys & Lists</h2>
    <Eventcomponent onClick={SubmitEvent}></Eventcomponent>
     
    <ul>{listItems}</ul>
      <h2>Conditional Rendering</h2>

      <Logincontrol></Logincontrol>
      <h2>Refs</h2>
      <Form/>
      
      
      
     
      </div>
        
  );
}

export default App;
