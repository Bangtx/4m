import styles from "@/app/page.module.css";
import {HeaderBar, CommonTable, SearchAndAdd} from "@/app/component";
import {Button, Typography, Stack} from '@mui/material'


export default function Home() {
    const companies = [
        {id: 1, code: 1, name: 'comtect'},
        {id: 2, code: 2, name: '4m company'},
    ]
    return (
        <main className={styles.main}>
            <HeaderBar/>
            <SearchAndAdd/>
            <CommonTable rows={companies} className={'center mt-4'}/>
        </main>
    );
}