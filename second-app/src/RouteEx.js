import { Home } from '@material-ui/icons';
import React from 'react';
import {BrowserRouter as Router,Switch,Route,Link} from 'react-router-dom';
import App from './App';
import Home1 from './Home1';
import Tables from './Tables';
class RouteEx extends React.Component
{
render()
{
    return(
      <div Style="background-color:lightblue;text-align:center">
      <Router>
      <ul>
          <Switch>
           
          <Route path="/home1" exact component={Home1}/>
         <li> <Link to="/home1">Home</Link></li>
          </Switch>
        <Switch>
          <Route path="/app" exact component={App}/>
            <li> <Link to="/app">App</Link></li> 
              </Switch>
              <Switch>
          <Route path="/tables" exact component={Tables}/>
          <li>  <Link to="/tables">mui-dataTables</Link></li> 
             
              </Switch>
              </ul>
      </Router>
      </div>
    )
}
}
export default RouteEx;