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
import de.msrd0.fontawesome.Style.REGULAR

/** Window Restore */
object FA_WINDOW_RESTORE: Icon {
	
	override val name get() = "Window Restore"
	
	override val unicode get() = "f2d2"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M432 64H208C199.2 64 192 71.16 192 80V96H128V80C128 35.82 163.8 0 208 0H432C476.2 0 512 35.82 512 80V304C512 348.2 476.2 384 432 384H416V320H432C440.8 320 448 312.8 448 304V80C448 71.16 440.8 64 432 64zM0 192C0 156.7 28.65 128 64 128H320C355.3 128 384 156.7 384 192V448C384 483.3 355.3 512 320 512H64C28.65 512 0 483.3 0 448V192zM96 256H288C305.7 256 320 241.7 320 224C320 206.3 305.7 192 288 192H96C78.33 192 64 206.3 64 224C64 241.7 78.33 256 96 256z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M432 48H208C190.3 48 176 62.33 176 80V96H128V80C128 35.82 163.8 0 208 0H432C476.2 0 512 35.82 512 80V304C512 348.2 476.2 384 432 384H416V336H432C449.7 336 464 321.7 464 304V80C464 62.33 449.7 48 432 48zM320 128C355.3 128 384 156.7 384 192V448C384 483.3 355.3 512 320 512H64C28.65 512 0 483.3 0 448V192C0 156.7 28.65 128 64 128H320zM64 464H320C328.8 464 336 456.8 336 448V256H48V448C48 456.8 55.16 464 64 464z"/></svg>"""
		else -> null
	}
	
}
