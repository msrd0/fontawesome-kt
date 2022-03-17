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

/** Binoculars */
object FA_BINOCULARS: Icon {
	
	override val name get() = "Binoculars"
	
	override val unicode get() = "f1e5"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M416 48C416 39.13 408.9 32 400 32h-64C327.1 32 320 39.13 320 48V96h96.04L416 48zM63.88 160.1C61.34 253.9 3.5 274.3 0 404V448c0 17.6 14.4 32 32 32h128c17.6 0 32-14.4 32-32V128H95.88C78.26 128 64.35 142.5 63.88 160.1zM448.1 160.1C447.6 142.5 433.7 128 416.1 128H320v320c0 17.6 14.4 32 32 32h128c17.6 0 32-14.4 32-32v-44C508.5 274.3 450.7 253.9 448.1 160.1zM224 288h64V128H224V288zM176 32h-64C103.1 32 96 39.13 96 48L95.96 96H192V48C192 39.13 184.9 32 176 32z"/></svg>"""
		else -> null
	}
	
}
