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

/** Object Group */
object FA_OBJECT_GROUP: Icon {
	
	override val name get() = "Object Group"
	
	override val unicode get() = "f247"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M128 160C128 142.3 142.3 128 160 128H288C305.7 128 320 142.3 320 160V256C320 273.7 305.7 288 288 288H160C142.3 288 128 273.7 128 256V160zM288 320C323.3 320 352 291.3 352 256V224H416C433.7 224 448 238.3 448 256V352C448 369.7 433.7 384 416 384H288C270.3 384 256 369.7 256 352V320H288zM32 119.4C12.87 108.4 0 87.69 0 64C0 28.65 28.65 0 64 0C87.69 0 108.4 12.87 119.4 32H456.6C467.6 12.87 488.3 0 512 0C547.3 0 576 28.65 576 64C576 87.69 563.1 108.4 544 119.4V392.6C563.1 403.6 576 424.3 576 448C576 483.3 547.3 512 512 512C488.3 512 467.6 499.1 456.6 480H119.4C108.4 499.1 87.69 512 64 512C28.65 512 0 483.3 0 448C0 424.3 12.87 403.6 32 392.6V119.4zM119.4 96C113.8 105.7 105.7 113.8 96 119.4V392.6C105.7 398.2 113.8 406.3 119.4 416H456.6C462.2 406.3 470.3 398.2 480 392.6V119.4C470.3 113.8 462.2 105.7 456.6 96H119.4z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M128 160C128 142.3 142.3 128 160 128H288C305.7 128 320 142.3 320 160V256C320 273.7 305.7 288 288 288H160C142.3 288 128 273.7 128 256V160zM288 320C323.3 320 352 291.3 352 256V224H416C433.7 224 448 238.3 448 256V352C448 369.7 433.7 384 416 384H288C270.3 384 256 369.7 256 352V320H288zM48 115.8C38.18 106.1 32 94.22 32 80C32 53.49 53.49 32 80 32C94.22 32 106.1 38.18 115.8 48H460.2C469 38.18 481.8 32 496 32C522.5 32 544 53.49 544 80C544 94.22 537.8 106.1 528 115.8V396.2C537.8 405 544 417.8 544 432C544 458.5 522.5 480 496 480C481.8 480 469 473.8 460.2 464H115.8C106.1 473.8 94.22 480 80 480C53.49 480 32 458.5 32 432C32 417.8 38.18 405 48 396.2V115.8zM96 125.3V386.7C109.6 391.6 120.4 402.4 125.3 416H450.7C455.6 402.4 466.4 391.6 480 386.7V125.3C466.4 120.4 455.6 109.6 450.7 96H125.3C120.4 109.6 109.6 120.4 96 125.3z"/></svg>"""
		else -> null
	}
	
}
