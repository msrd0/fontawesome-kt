/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_CUBES_STACKED: Icon {
	
	override val name get() = "Cubes Stacked"
	
	override val unicode get() = "e4e6"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M192 64C192 46.33 206.3 32 224 32H288C305.7 32 320 46.33 320 64V128C320 145.7 305.7 160 288 160H224C206.3 160 192 145.7 192 128V64zM138.1 174.1C153.4 166.1 172.1 171.4 181.8 186.7L213.8 242.1C222.6 257.4 217.4 276.1 202.1 285.8L146.7 317.8C131.4 326.6 111.8 321.4 102.1 306.1L70.96 250.7C62.12 235.4 67.37 215.8 82.67 206.1L138.1 174.1zM352 192C369.7 192 384 206.3 384 224V288C384 305.7 369.7 320 352 320H288C270.3 320 256 305.7 256 288V224C256 206.3 270.3 192 288 192H352zM416 352C433.7 352 448 366.3 448 384V448C448 465.7 433.7 480 416 480H352C334.3 480 320 465.7 320 448V384C320 366.3 334.3 352 352 352H416zM160 384C160 366.3 174.3 352 192 352H256C273.7 352 288 366.3 288 384V448C288 465.7 273.7 480 256 480H192C174.3 480 160 465.7 160 448V384zM96 352C113.7 352 128 366.3 128 384V448C128 465.7 113.7 480 96 480H32C14.33 480 0 465.7 0 448V384C0 366.3 14.33 352 32 352H96z"/></svg>"""
		else -> null
	}
	
}
