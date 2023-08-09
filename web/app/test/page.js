import styles from "@/app/page.module.css";
import {HeaderBar} from "@/app/component";


export default function MenuAppBar() {
  return (
    <main className={styles.main}>
      <HeaderBar/>
    </main>
  );
}