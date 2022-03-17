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

object FA_TRAFFIC_LIGHT: Icon {
	
	override val name get() = "Traffic Light"
	
	override val unicode get() = "f637"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M256 0C291.3 0 320 28.65 320 64V352C320 440.4 248.4 512 160 512C71.63 512 0 440.4 0 352V64C0 28.65 28.65 0 64 0H256zM160 320C133.5 320 112 341.5 112 368C112 394.5 133.5 416 160 416C186.5 416 208 394.5 208 368C208 341.5 186.5 320 160 320zM160 288C186.5 288 208 266.5 208 240C208 213.5 186.5 192 160 192C133.5 192 112 213.5 112 240C112 266.5 133.5 288 160 288zM160 64C133.5 64 112 85.49 112 112C112 138.5 133.5 160 160 160C186.5 160 208 138.5 208 112C208 85.49 186.5 64 160 64z"/></svg>"""
		else -> null
	}
	
}
