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

/** Soap */
object FA_SOAP: Icon {
	
	override val name get() = "Soap"
	
	override val unicode get() = "e06e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M320 256c35.35 0 64-28.65 64-64c0-35.35-28.65-64-64-64s-64 28.65-64 64C256 227.3 284.7 256 320 256zM160 288c-35.35 0-64 28.65-64 64c0 35.35 28.65 64 64 64h192c35.35 0 64-28.65 64-64c0-35.35-28.65-64-64-64H160zM384 64c17.67 0 32-14.33 32-32c0-17.67-14.33-32-32-32s-32 14.33-32 32C352 49.67 366.3 64 384 64zM208 96C234.5 96 256 74.51 256 48S234.5 0 208 0S160 21.49 160 48S181.5 96 208 96zM416 192c0 27.82-12.02 52.68-30.94 70.21C421.7 275.7 448 310.7 448 352c0 53.02-42.98 96-96 96H160c-53.02 0-96-42.98-96-96s42.98-96 96-96h88.91C233.6 238.1 224 216.7 224 192H96C42.98 192 0 234.1 0 288v128c0 53.02 42.98 96 96 96h320c53.02 0 96-42.98 96-96V288C512 234.1 469 192 416 192z"/></svg>"""
		else -> null
	}
	
}
