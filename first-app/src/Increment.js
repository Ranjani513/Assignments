import React,{Component} from 'react';
class Increment extends Component{
constructor(props)
{
    super(props)
    this.state={
        name:"Ranjani",
        Employee_Id:40420,
        count:0

    }
   
}
increamentcount()
{
   
    this.setState(
        {
            
            count:this.state.count+1,
            
            name:"Nikhila"
            }
        
    )}
    render()
    {
        return(
            <div>
                <h3>Count:{this.state.count}</h3>
        <p><h3>Updated Name:{this.state.name}</h3></p>
                <button onClick={()=>this.increamentcount()}>Update</button>
            </div>
        )
    }
}
export default Increment;