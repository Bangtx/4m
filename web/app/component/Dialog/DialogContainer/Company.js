import DialogContainer from './index'
import {TextField, Stack} from "@mui/material";
import {useState} from "react";


const CompanyDialog = ({show, onClose, title}) => {
    const [company, setCompany] = useState({
        id: null,
        code: null,
        name: null,
        address: null
    })

    const onInput = (key, value) => {
        setCompany({...company, [key]: value})
    }

    const onSave = () => {
        console.log(company)
    }

    return (
        <DialogContainer show={show} onClose={onClose} title={title} onSave={onSave}>
            <Stack>
                <TextField variant="standard" label='Code' fullWidth
                           onInput={(event) => onInput('code', event.target.value)}/>
                <TextField variant="standard" label='Name' fullWidth
                           onInput={(event) => onInput('name', event.target.value)}/>
                <TextField variant="standard" label='Adress' fullWidth
                           onInput={(event) => onInput('address', event.target.value)}/>
            </Stack>
        </DialogContainer>
    )
}

export default CompanyDialog