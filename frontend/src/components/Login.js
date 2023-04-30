import React, { useState } from 'react'
import './css/Form.css'
import { Typography } from "@mui/material";




const Login = () => {
    const [username, setUsername] = useState('')
    const [password, setPassword] = useState('')

    const handleClick=(e)=>{
        e.preventDefault
    }
    return (
        <>
            <div className="form-wrapper">
                <div className="header">
                    <Typography variant="overline">
                        <h1>Login</h1>
                    </Typography>
                </div>
                <form className="register-form" id="register-form" noValidate autoComplete="off">
                    <div className="form-group">
                        <label htmlFor="name">
                            Email:
                        </label>
                        <input type="text" name="name" id="name" onChange={(e)=>setName(e.target.value)}/>
                    </div>
                    <div className="form-group">
                        <label htmlFor="name">
                            Password:
                        </label>
                        <input type="text" name="name" id="name" autoComplete="off" />
                    </div>
                    <div className="form-group">
                        <input type="submit" name="login" id="login" className="form-submit" value = "Login"/>
                    </div>
                </form>
            </div>
        </>
    )
}

export default Login;