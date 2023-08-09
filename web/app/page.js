import styles from "@/app/page.module.css";
import {HeaderBar, CommonTable, SearchAndAdd} from "@/app/component";
import {Button, Typography, Stack} from '@mui/material'


const columns = [
    {name: 'id', text: 'Id'},
    {name: 'code', text: 'Code'},
    {name: 'name', text: 'Name'},
    {name: 'address', text: 'Address'}
]

export default function Home() {
    const companies = [
        {id: 1, code: 1, name: 'comtect', address: 'Ha Noi'},
        {id: 2, code: 2, name: '4m company'},
    ]
    return (
        <main className={styles.main}>
            <HeaderBar/>
            <SearchAndAdd/>
            <CommonTable columns={columns} rows={companies} className={'center mt-4'}/>
        </main>
    );
}