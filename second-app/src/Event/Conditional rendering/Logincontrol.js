import { render } from '@testing-library/react';
import React from 'react';
import  './Lodincontrol.css';
class Logincontrol extends React.Component{
  constructor(props)
  {
      super(props);
      this.handlelogin=this.handlelogin.bind(this);
      this.handlelogout=this.handlelogout.bind(this);
      this.state={isLogin:true}
  }

handlelogout()
{
 this.setState({isLogin:false})
}
handlelogin()
{
 this.setState({isLogin:true})
}
render()
{
    const isLogin=this.state.isLogin;
     
          let button;
            if(isLogin)
            {
                button=<Logoutbutton onClick={this.handlelogout}/>
            }
            else
            {
                button=<Loginbutton onClick={this.handlelogin}/>
            }
            return(
                <div>
                    <Msg isLogin={isLogin}/>
                    {button}
                </div>
            );
     }

}
         function MsgSuccess()
         {
             return <h2 Style="background-color:yellow;">Welcome!</h2>
         }
         function MsgFail()
         {
             return <h2  Style="background-color:yellow;">Thank You</h2>
         }
            function Msg(props)
            {
                const isLogin=props.isLogin;
                if(isLogin)
                {
                    return(
                        <MsgSuccess/>
                    )
                }
                else{
                    return(
                   <MsgFail/>
                    )
                }
            }
             function Loginbutton(props)
             {
                 return(
                 
                 <button onClick={props.onClick}>Login</button>
                 );
             } 
             function Logoutbutton(props)
             {
                 return(
                 <button onClick={props.onClick}>Logout</button>
                 );
             }   
            
      
    

export default Logincontrol;

