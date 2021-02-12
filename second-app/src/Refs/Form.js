import React from 'react';
class Form extends React.Component
{
    constructor(props)
    {
  super(props);
  this.name=React.createRef();
  this.email=input=>{this.pass=input}
    }
 componentDidMount()
 {
    this.name.current.focus();
 }
  handleSubmit=(e)=>{
     // alert("hello");
      e.preventDefault();
      console.log(this.name.current.value,this.refs.pass.value,this.pass.value,this.props);
   this.props.history.push('/app');
      alert(`Hello ${this.name.current.value}`);
  }

  render()
  {
      return(
        <div className="container">      
           FirstName:
           <div className="form-group">
        <input type="text" ref={this.name} className="form-group"></input>  
        </div>
        password:
        <div className="form-group">
        <input type="password" ref="pass"  className="form-group"></input>
        </div>
        Email:
        <div className="form-group">
        <input type="email" ref={this.email}  className="form-group"></input>
        </div>
        <button type="submit" class="btn btn-primary"onClick={e=>this.handleSubmit(e)}>Submit</button> 
        </div>
      
      );
  }
  
}
export default Form;