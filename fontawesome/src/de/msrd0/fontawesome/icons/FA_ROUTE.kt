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

object FA_ROUTE: Icon {
	
	override val name get() = "Route"
	
	override val unicode get() = "f4d7"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M320 256C302.3 256 288 270.3 288 288C288 305.7 302.3 320 320 320H416C469 320 512 362.1 512 416C512 469 469 512 416 512H139.6C148.3 502.1 158.9 489.4 169.6 475.2C175.9 466.8 182.4 457.6 188.6 448H416C433.7 448 448 433.7 448 416C448 398.3 433.7 384 416 384H320C266.1 384 223.1 341 223.1 288C223.1 234.1 266.1 192 320 192H362.1C340.2 161.5 320 125.4 320 96C320 42.98 362.1 0 416 0C469 0 512 42.98 512 96C512 160 416 256 416 256H320zM416 128C433.7 128 448 113.7 448 96C448 78.33 433.7 64 416 64C398.3 64 384 78.33 384 96C384 113.7 398.3 128 416 128zM118.3 487.8C118.1 488 117.9 488.2 117.7 488.4C113.4 493.4 109.5 497.7 106.3 501.2C105.9 501.6 105.5 502 105.2 502.4C99.5 508.5 96 512 96 512C96 512 0 416 0 352C0 298.1 42.98 255.1 96 255.1C149 255.1 192 298.1 192 352C192 381.4 171.8 417.5 149.9 448C138.1 463.2 127.7 476.9 118.3 487.8L118.3 487.8zM95.1 384C113.7 384 127.1 369.7 127.1 352C127.1 334.3 113.7 320 95.1 320C78.33 320 63.1 334.3 63.1 352C63.1 369.7 78.33 384 95.1 384z"/></svg>"""
		else -> null
	}
	
}
