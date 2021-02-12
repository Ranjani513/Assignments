import React from 'react';

/*class Stateex extends React.Component {
   constructor(props) {
      super(props);
		
      this.state = {
         header: "Header from state...",
         content: "Content from state..."
      }
   }
   render() {
      return (
         <div>
            <h1>{this.state.header}</h1>
            <h2>{this.state.content}</h2>
         </div>
      );
   }
}
export default Stateex;
import react from 'react';
import ReactDOM from 'react.dom';*/
class Stateex extends React.Component{
   

    render(){
        return<div>
        <h3>Welcome to Company</h3>
        <Employee></Employee>
        </div>
    }

}
class Employee extends React.Component{
    render()
    {
        return<div>
            <h3>Welcome to Employee</h3>
            <Salary></Salary>
        </div>
    }
}
class Salary extends React.Component{
    render()
    {
        return<div>
            <h3>Welcome to salary portal</h3>
            
        </div>
    }
}
export default Stateex;
