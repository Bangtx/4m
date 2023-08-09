"use client"
import styles from "@/app/page.module.css";
import {HeaderBar, CommonTable, SearchAndAdd, CompanyDialog} from "@/app/component";
import {useState} from "react";
import {Typography, Box, TextField, Button, Grid, Hidden, Stack} from "@mui/material";


const columns = [
    {name: 'id', text: 'Id'},
    {name: 'code', text: 'Code'},
    {name: 'name', text: 'Name'},
    {name: 'address', text: 'Address'}
]

export default function Home() {
    const [showCompanyDialog, setShowCompanyDialog] = useState(false)
    const companies = [
        {id: 1, code: 1, name: 'comtect', address: 'Ha Noi'},
        {id: 2, code: 2, name: '4m company'},
    ]
    return (
        <main className={styles.main}>
            <HeaderBar/>
            <SearchAndAdd openAddDialog={() => setShowCompanyDialog(true)}/>
            <Button onClick={() => setShowCompanyDialog(true)}>test</Button>
            <CommonTable columns={columns} rows={companies} className={'center mt-4'}/>
            <CompanyDialog show={showCompanyDialog} onClose={() => setShowCompanyDialog(false)}/>
        </main>
    );
}